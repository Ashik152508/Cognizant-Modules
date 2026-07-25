-- nested_loop.sql
-- Demonstrates nested loops in PL/SQL
BEGIN
  FOR outer_counter IN 1..3 LOOP
    DBMS_OUTPUT.PUT_LINE('Outer loop: ' || outer_counter);
    FOR inner_counter IN 1..2 LOOP
      DBMS_OUTPUT.PUT_LINE('  Inner loop: ' || inner_counter);
    END LOOP;
  END LOOP;
END;
/
