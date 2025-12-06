-- Last updated: 12/6/2025, 11:58:19 PM
# Write your MySQL query statement below

SELECT * 
FROM Cinema 
WHERE id % 2 != 0 AND description <> 'boring'
ORDER BY rating desc;




