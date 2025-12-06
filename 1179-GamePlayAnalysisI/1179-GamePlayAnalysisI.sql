-- Last updated: 12/6/2025, 11:57:35 PM
# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;