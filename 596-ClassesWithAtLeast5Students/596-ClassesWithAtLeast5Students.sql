-- Last updated: 12/6/2025, 11:58:28 PM

# Write your MySQL query statement below
select class from courses
group by class
having count(distinct student)>=5