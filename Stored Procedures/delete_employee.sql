-- delete_employee.sql
-- Stored procedure to delete an employee by employee_id.

CREATE OR REPLACE PROCEDURE delete_employee(p_emp_id IN NUMBER) AS
BEGIN
    DELETE FROM employees
     WHERE employee_id = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID ' || p_emp_id || ' does not exist.');
    END IF;

    COMMIT;
END delete_employee;
/
