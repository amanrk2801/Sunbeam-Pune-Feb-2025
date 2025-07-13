DROP PROCEDURE IF EXISTS sp_updateStudent;
DELIMITER $$
CREATE PROCEDURE sp_updateStudent(IN p_rollno INT, IN p_marks DECIMAL)
BEGIN
UPDATE student SET marks=p_marks WHERE rollno = p_rollno;
END
$$
DELIMITER ;