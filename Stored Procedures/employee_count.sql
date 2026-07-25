-- employee_count.sql
-- Stored procedure to count employees and return the value via an OUT parameter.

CREATE OR REPLACE PROCEDURE employee_count(p_count OUT NUMBER) AS
BEGIN
    SELECT COUNT(*)
      INTO p_count
      FROM employees;
END employee_count;
/
