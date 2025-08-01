-- Last updated: 8/1/2025, 1:57:23 PM
# Write your MySQL query statement beloow
with x as(
select firstName,lastName,city,state from person p
left join address a
on p.personId = a.personId)
select * from x