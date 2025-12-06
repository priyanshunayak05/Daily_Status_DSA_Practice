-- Last updated: 12/6/2025, 11:58:20 PM
# Write your MySQL query statement below
with tb as (
select
    num
from
    MyNumbers as a
group by num
having count(num) = 1
order by num desc
)
select max(num) as num
from tb;