
SELECT * FROM employee


--spUpdateEmployee
CREATE PROC spUpdateEmployee
@employeeID VARCHAR(40),
@lname VARCHAR(40),
@fname VARCHAR(20)
AS
BEGIN

	UPDATE employee

	SET 
		lname = @lname, 
		fname = @fname

	WHERE 
		employee.emp_id = @employeeID

END




--spFindEmployee
CREATE PROC spFindEmployee
@employeeID VARCHAR(40)
AS
BEGIN

	SELECT
		*

	FROM
		employee AS EM

	WHERE
		EM.emp_id = @employeeID

END




--spFindEmployees
CREATE PROC spFindEmployees
@employee_lname VARCHAR(40)
AS
BEGIN
    
    SELECT
        *

    FROM
        employee AS EM
    
    WHERE
        EM.lname LIKE '%' + @employee_lname + '%'

END




-- spFindJob
CREATE PROC spFindJob
@searchTXT VARCHAR(80)
AS
BEGIN

    SELECT
        JO.job_desc AS 'Job Title',
        JO.min_lvl AS 'Min Level',
        JO.max_lvl AS 'Max Level'

    FROM
        jobs AS JO

    WHERE
        JO.job_desc LIKE '%' + @searchTXT + '%'

    ORDER BY
        JO.max_lvl DESC

END