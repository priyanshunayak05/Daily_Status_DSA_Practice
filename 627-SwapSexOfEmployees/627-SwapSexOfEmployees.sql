-- Last updated: 12/6/2025, 11:58:17 PM
# Write your MySQL query statement below
UPDATE Salary 
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END) 