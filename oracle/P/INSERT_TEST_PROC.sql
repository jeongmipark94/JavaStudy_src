procedure insert_test_proc(
		empno number, ename varchar2, sal number,
		job varchar2, msg out varchar2, row_cnt out number )

is
    temp_sal number := sal;
begin
	row_cnt := 0;
	--제약 1번
	if empno between 1 and 9999 then
	--제약 2번
		if temp_sal < 2500 then
		     temp_sal := 2500;
		end if;

		if temp_sal > 8000 then
			temp_sal := 8000;
		end if;
		--3번 제약조건
		if job in('사원', '주임', '대리', '과장', '차장', '부장', '이사') then

		--4번 제약조건 initcap
			insert into test_proc(empno, ename, hiredate, sal, job)
				values(empno, initcap(ename),sysdate, temp_sal, job);

			row_cnt :=sql%rowcount; --sql 은암시적 커서

			commit;

			msg := empno||'번 사원 정보가 추가되었습니다.';

		else
			msg := job||'은 입력가능한 직급이 아닙니다.';
		end if;

	else
			msg := empno||'사원번호는 1~9999 사이가 아닙니다.';

	end if;
		exception
		when dup_val_on_index then
			msg := empno||'번 사원번호는 이미 존재합니다.';
		when others then
--			msg :='예외발생 : '||sqlerrm||'/'||sqlcode;
			if sqlcode = -12899 then
				msg:=ename||'명은 한글 3자 영어 10자 를 초과하였습니다.';
			end if;
end;
