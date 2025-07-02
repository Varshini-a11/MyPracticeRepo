DECLARE
    p_number NUMBER := 5;
    v_result NUMBER;
BEGIN
    v_result := p_number * p_number;
    DBMS_OUTPUT.PUT_LINE('Square of ' || p_number || ' is: ' || v_result);
END;
/
