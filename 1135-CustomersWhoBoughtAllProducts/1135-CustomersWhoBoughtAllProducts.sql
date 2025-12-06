-- Last updated: 12/6/2025, 11:57:40 PM
# Write your MySQL query statement below
with cte as(
    select customer_id, count(distinct product_key) as cnt
    from Customer
    group by customer_id
)
select cte.customer_id as customer_id
from cte 
where cte.cnt= (select count(*) from Product);