-- for_loop.sql
-- Demonstrates a FOR loop in PL/SQL
BEGIN
  FOR i IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE('For loop index: ' || i);
  END LOOP;
END;
/
