DROP PROCEDURE IF EXISTS sp_getMobile;
DELIMITER $$
CREATE PROCEDURE sp_getMobile(IN p_rollno INT, OUT p_mobile VARCHAR(10))
BEGIN
SELECT mobile FROM student WHERE rollno = p_rollno INTO p_mobile;
END
$$
DELIMITER ;