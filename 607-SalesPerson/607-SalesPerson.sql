-- Last updated: 12/6/2025, 11:58:24 PM
# Write your MySQL query statement below
select salesperson.name
from orders o join company c on (o.com_id = c.com_id and c.name = 'RED')
right join salesperson on salesperson.sales_id = o.sales_id
where o.sales_id is null