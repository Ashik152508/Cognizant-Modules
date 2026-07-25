-- case_statement.sql
-- Demonstrates a CASE expression in PL/SQL
DECLARE
  v_grade CHAR := 'B';
  v_message VARCHAR2(50);
BEGIN
  CASE v_grade
    WHEN 'A' THEN
      v_message := 'Excellent';
    WHEN 'B' THEN
      v_message := 'Good';
    WHEN 'C' THEN
      v_message := 'Satisfactory';
    WHEN 'D' THEN
      v_message := 'Needs Improvement';
    ELSE
      v_message := 'Unknown grade';
  END CASE;

  DBMS_OUTPUT.PUT_LINE('Grade ' || v_grade || ': ' || v_message);
END;
/
