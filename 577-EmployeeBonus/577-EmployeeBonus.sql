-- Last updated: 12/6/2025, 11:58:33 PM

# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus FROM Employee 
LEFT JOIN Bonus ON Employee.empID = Bonus.empID
WHERE bonus < 1000 OR Bonus IS NULL ;