insert into studentgroup(id,name) values ('b275fc84-6d32-4011-9122-28042e617f97', 'TTK-15');
insert into studentgroup(id,name) values ('ff0334b4-4217-4fb7-8db8-ab6769b11162', 'TTK-16');
insert into studentgroup(id,name) values ('804d56c5-9024-47a5-950c-e0b7e6e31183', 'SR-15');



insert into student(id,firstname,lastname,age,time,groupid_id)
values('fba6fdc7-ec50-48a5-863c-94a4df571229','Kolya','Lutskiy',18,'2022-09-10 14:16:32.676655','b275fc84-6d32-4011-9122-28042e617f97');
insert into student(id,firstname,lastname,age,time,groupid_id)
values('1fbabce1-0d83-4f83-baf5-3543c3f69e54','Artem','Kirov',22,'2022-09-10 14:16:32.676655','b275fc84-6d32-4011-9122-28042e617f97');
insert into student(id,firstname,lastname,age,time,groupid_id)
values('17bbe591-3ffe-4d57-a6ab-7dd17b37af6e','Nikolai','Nikolaev',19,'2022-09-10 14:16:32.676655','b275fc84-6d32-4011-9122-28042e617f97');


insert into subject(id,name)
values('3da67860-07ed-4d96-87e8-093bbd2ab78e', 'Math');
insert into subject(id,name)
values('82c3a0df-2bd1-40e8-a612-ed251b6a4874', 'Physics');



insert into professor(id,firstname,lastname,age,subject_id)
values('6ab2beab-e6fd-4dd3-b444-ac7e524cce8d','Leonid', 'Vasilyev', 44,'92bb25c4-aed0-47c1-bbf9-9f37d2790ccb');

insert into professor(id,firstname,lastname,age,subject_id)
values('87e2ff73-66f6-42a2-b7fb-035552084181','Nikolay', 'Zagrebelniy', 30,'82c3a0df-2bd1-40e8-a612-ed251b6a4874');





insert into mark(id,"value",student_id,subjectname_id)
values('908c44fa-26ce-4aef-a279-4b896df1dfa5',2,'fba6fdc7-ec50-48a5-863c-94a4df571229','92bb25c4-aed0-47c1-bbf9-9f37d2790ccb');
insert into mark(id,"value",student_id,subjectname_id)
values('673895da-c974-4661-a1ac-fe08ce6e9100',3,'1fbabce1-0d83-4f83-baf5-3543c3f69e54','92bb25c4-aed0-47c1-bbf9-9f37d2790ccb');
insert into mark(id,"value",student_id,subjectname_id)
values('8135c28c-51af-4e60-805e-faab89ed6b4c',1,'17bbe591-3ffe-4d57-a6ab-7dd17b37af6e','92bb25c4-aed0-47c1-bbf9-9f37d2790ccb');

insert into mark(id,"value",student_id,subjectname_id)
values('56f83845-b8d5-4889-93c8-0c032c43c6d8',4,'fba6fdc7-ec50-48a5-863c-94a4df571229','82c3a0df-2bd1-40e8-a612-ed251b6a4874');
insert into mark(id,"value",student_id,subjectname_id)
values('ed5313a9-43ba-45b2-80c9-a03b4a399f58',5,'1fbabce1-0d83-4f83-baf5-3543c3f69e54','82c3a0df-2bd1-40e8-a612-ed251b6a4874');
insert into mark(id,"value",student_id,subjectname_id)
values('cf1234a2-cacb-4847-8b5b-e6b35be89fbb',4,'17bbe591-3ffe-4d57-a6ab-7dd17b37af6e','82c3a0df-2bd1-40e8-a612-ed251b6a4874');
