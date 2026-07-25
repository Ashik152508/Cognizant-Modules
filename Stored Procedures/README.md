# PLSQL Stored Procedures

This folder contains example PLSQL scripts for creating and managing an `employees` table.

Files:
- `create_table.sql` — creates the `employees` table.
- `insert_data.sql` — inserts sample employee rows.
- `display_employee.sql` — procedure to display employee details by `employee_id`.
- `update_salary.sql` — procedure to update an employee's salary.
- `employee_count.sql` — procedure to return the total number of employees.
- `delete_employee.sql` — procedure to delete an employee by `employee_id`.

Usage:
1. Run `create_table.sql` to create the table.
2. Run `insert_data.sql` to add sample rows.
3. Compile the stored procedure scripts in Oracle SQL*Plus or SQL Developer.
4. Call procedures with `EXECUTE procedure_name(arguments);` or anonymous PL/SQL blocks.

Example:
```sql
BEGIN
    display_employee(1);
END;
/
```
