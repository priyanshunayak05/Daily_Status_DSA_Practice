-- Last updated: 12/6/2025, 11:57:38 PM
#SOL-1
SELECT 
    P.project_id,
    ROUND(
        AVG(E.experience_years),
        2
    ) AS average_years
FROM 
    Project P
JOIN 
    Employee E 
    ON P.employee_id = E.employee_id
GROUP BY P.project_id;
