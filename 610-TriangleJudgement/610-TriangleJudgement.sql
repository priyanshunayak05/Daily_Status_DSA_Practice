-- Last updated: 12/6/2025, 11:58:21 PM
# Write your MySQL query statement below
select x, y, z, 
if(x+y>z and x+z>y and y+z>x, 'Yes', 'No' ) as triangle
from Triangle 