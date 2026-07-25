-- while_loop.sql
-- Demonstrates a WHILE loop in PL/SQL
DECLARE
  v_counter NUMBER := 1;
BEGIN
  WHILE v_counter <= 5 LOOP
    DBMS_OUTPUT.PUT_LINE('While loop count: ' || v_counter);
    v_counter := v_counter + 1;
  END LOOP;
END;
/
