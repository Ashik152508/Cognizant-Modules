-- update_salary.sql
-- Stored procedure to update an employee salary.

CREATE OR REPLACE PROCEDURE update_salary(
    p_emp_id IN NUMBER,
    p_new_salary IN NUMBER
) AS
BEGIN
    UPDATE employees
       SET salary = p_new_salary
     WHERE employee_id = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Employee ID ' || p_emp_id || ' does not exist.');
    END IF;

    COMMIT;
END update_salary;
/
