-- if_statement.sql
-- Demonstrates a simple IF statement in PL/SQL
DECLARE
  v_number NUMBER := 7;
BEGIN
  IF v_number > 0 THEN
    DBMS_OUTPUT.PUT_LINE('Number is positive: ' || v_number);
  END IF;
END;
/
