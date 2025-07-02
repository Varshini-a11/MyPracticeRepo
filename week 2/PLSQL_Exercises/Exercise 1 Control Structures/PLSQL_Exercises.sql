DECLARE
    num NUMBER := 5;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is positive');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is not positive');
    END IF;
END;
/
