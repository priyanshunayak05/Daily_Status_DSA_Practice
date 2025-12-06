-- Last updated: 12/6/2025, 11:58:30 PM
# Write your MySQL query statement below
select customer_number 
from Orders 
group by customer_number 
order by count(customer_number) desc 
limit 1;