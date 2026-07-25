-- loop_statement.sql
-- Demonstrates an unconditional LOOP with EXIT WHEN in PL/SQL
DECLARE
  v_counter NUMBER := 1;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE('Loop iteration: ' || v_counter);
    v_counter := v_counter + 1;
    EXIT WHEN v_counter > 5;
  END LOOP;
END;
/
