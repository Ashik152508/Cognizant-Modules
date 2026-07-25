-- insert_data.sql
-- Insert sample employee rows into the EMPLOYEES table.

BEGIN
    INSERT INTO employees (first_name, last_name, email, hire_date, salary, department)
    VALUES ('Alice', 'Patel', 'alice.patel@example.com', SYSDATE - 120, 75000, 'HR');

    INSERT INTO employees (first_name, last_name, email, hire_date, salary, department)
    VALUES ('Brian', 'Chen', 'brian.chen@example.com', SYSDATE - 90, 82000, 'Finance');

    INSERT INTO employees (first_name, last_name, email, hire_date, salary, department)
    VALUES ('Carmen', 'Smith', 'carmen.smith@example.com', SYSDATE - 45, 68000, 'Sales');

    INSERT INTO employees (first_name, last_name, email, hire_date, salary, department)
    VALUES ('David', 'Lopez', 'david.lopez@example.com', SYSDATE - 30, 91000, 'IT');

    INSERT INTO employees (first_name, last_name, email, hire_date, salary, department)
    VALUES ('Elena', 'Kumar', 'elena.kumar@example.com', SYSDATE - 15, 72000, 'Marketing');

    COMMIT;
END;
/
