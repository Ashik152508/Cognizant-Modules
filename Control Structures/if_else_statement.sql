-- if_else_statement.sql
-- Demonstrates IF / ELSE logic in PL/SQL
DECLARE
  v_number NUMBER := -3;
BEGIN
  IF v_number > 0 THEN
    DBMS_OUTPUT.PUT_LINE('Number is positive: ' || v_number);
  ELSE
    DBMS_OUTPUT.PUT_LINE('Number is zero or negative: ' || v_number);
  END IF;
END;
/
