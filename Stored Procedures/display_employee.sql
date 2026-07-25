-- display_employee.sql
-- Stored procedure to display employee details by employee_id.

CREATE OR REPLACE PROCEDURE display_employee(p_emp_id IN NUMBER) AS
    v_first_name employees.first_name%TYPE;
    v_last_name  employees.last_name%TYPE;
    v_email      employees.email%TYPE;
    v_hire_date  employees.hire_date%TYPE;
    v_salary     employees.salary%TYPE;
    v_department employees.department%TYPE;
BEGIN
    SELECT first_name, last_name, email, hire_date, salary, department
      INTO v_first_name, v_last_name, v_email, v_hire_date, v_salary, v_department
      FROM employees
     WHERE employee_id = p_emp_id;

    DBMS_OUTPUT.PUT_LINE('Employee ID : ' || p_emp_id);
    DBMS_OUTPUT.PUT_LINE('Name        : ' || v_first_name || ' ' || v_last_name);
    DBMS_OUTPUT.PUT_LINE('Email       : ' || v_email);
    DBMS_OUTPUT.PUT_LINE('Hire Date   : ' || TO_CHAR(v_hire_date, 'YYYY-MM-DD'));
    DBMS_OUTPUT.PUT_LINE('Salary      : ' || TO_CHAR(v_salary, 'FM999,999,990.00'));
    DBMS_OUTPUT.PUT_LINE('Department  : ' || NVL(v_department, 'N/A'));
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No employee found with ID ' || p_emp_id);
END display_employee;
/
