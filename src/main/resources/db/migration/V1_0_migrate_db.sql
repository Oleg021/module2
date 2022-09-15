create SCHEMA IF NOT EXISTS module;

CREATE TABLE IF NOT EXISTS module.grade
(

    id         character varying(255) COLLATE pg_catalog."default" NOT NULL,
    grade      integer                                             NOT NULL,
    lesson_id  character varying(255) COLLATE pg_catalog."default",
    student_id character varying(255) COLLATE pg_catalog."default"
);

CREATE TABLE IF NOT EXISTS module."group"
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default"

    );



CREATE TABLE IF NOT EXISTS module.lector
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    age integer NOT NULL,
    firstname character varying(255) COLLATE pg_catalog."default",
    lastname character varying(255) COLLATE pg_catalog."default",
    lesson_id character varying(255) COLLATE pg_catalog."default"

    );

CREATE TABLE IF NOT EXISTS module.lesson
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    code character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    lector_id character varying(255) COLLATE pg_catalog."default"

    );


CREATE TABLE IF NOT EXISTS module.student
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    age integer NOT NULL,
    date timestamp without time zone,
    firstname character varying(255) COLLATE pg_catalog."default",
    lastname character varying(255) COLLATE pg_catalog."default",
    group_id character varying(255) COLLATE pg_catalog."default"

    );

insert into module."group" (id , name ) values ('a8ef201a-3ced-423e-8837-cd3b9e62265e' , 'STZI-13' );
insert into module."group" (id , name ) values ('d8ddccec-b4ae-454f-b162-7994de34b226' , 'KN-15' );
insert into module."group" (id , name ) values ('c97e80c9-a93b-47e2-a1ee-fa4c4cc57220' , 'PI-11' );

insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('365cfa71-e327-49f9-9ef3-c52227899527','2022-09-08T18:02:44.276627400','Kira','Popova','19','d8ddccec-b4ae-454f-b162-7994de34b226');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('bb96ac43-995c-4751-a000-f9b7e0b12625','2022-09-08T18:02:44.277623600','Victoria','Prokofieva','29','a8ef201a-3ced-423e-8837-cd3b9e62265e');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('123903de-5782-4414-9875-ce55dcc32137','2022-09-08T18:02:44.277623600','Grigory','Prokhorov','27','a8ef201a-3ced-423e-8837-cd3b9e62265e');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('03b4c2b5-bd1b-4a5a-9e93-a79f4ebb1da7','2022-09-08T18:02:44.277623600','Mikhail','Rogov','18','a8ef201a-3ced-423e-8837-cd3b9e62265e');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('2b772f91-ab01-4c26-b705-dd488401cc9c','2022-09-08T18:02:44.277623600','Timofey','Rusanov','23','d8ddccec-b4ae-454f-b162-7994de34b226');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('1be29ff4-cf66-4e20-8995-f39f21460fe1','2022-09-08T18:02:44.277623600','Nadezhda','Sveshnikova','21','5a63c730-216c-4ae6-a80b-4e6be02c5e34');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('bd385200-dcf9-4c67-a300-1ed0f66e3982','2022-09-08T18:02:44.277623600','Maya','Sergeeva','28','a8ef201a-3ced-423e-8837-cd3b9e62265e');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('9e410b8f-7b0a-430d-a829-da5726d40616','2022-09-08T18:02:44.278620300','Anastasia','Simonova','18','508b1398-94fa-4265-a441-f87933aa9c25');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('f6ea39f4-2327-48f1-8726-49ce44b03b5f','2022-09-08T18:02:44.278620300','Alexey','Sokolov','23','a8ef201a-3ced-423e-8837-cd3b9e62265e');
insert into module."student" (id , date, firstName,  lastName, age, group_id) values ('eb515828-6597-4eb2-ab68-b55962177aff','2022-09-08T18:02:44.278620300','Daria','Sorokina','29','508b1398-94fa-4265-a441-f87933aa9c25');

insert into module."lesson" (id , code, name, lector_id) values ( '1f886243-6e87-498a-95fa-272496ca8c83','Math_01','Math Analis','424e757e-838a-4ae0-9af5-2c934b1da29a');
insert into module."lesson" (id , code, name, lector_id) values ( 'c2dd85d7-1ad4-4548-a78e-add249398101','KB_01','Basics of cybersecurity','e520bf9c-0a69-4d6e-8375-856c168ef7f0');
insert into module."lesson" (id , code, name, lector_id) values ( 'f6fb061d-4843-4f7f-8140-398ae7e6d099','OTC','Basics of circuit theory','dc15b961-6d38-475d-9742-fa65d6c45cd4');
insert into module."lesson" (id , code, name, lector_id) values ( 'e0b0ef92-3ce0-48d1-badf-afe2e7bda44f','MTaV','Metrology and Computer Engineering','0b990666-4fb5-46b0-8058-4f0511a0fca9');
insert into module."lesson" (id , code, name, lector_id) values ( '497cae95-365b-40a1-bd3a-bbadebe0ed33','TMofIS','Technical methods of information seurity','7907ffdc-c181-42b4-ab9a-f56c2ce1ab76');

insert into module."lector" (id , age ,firstName, lastName, lesson_id) values ( '424e757e-838a-4ae0-9af5-2c934b1da29a','49','Ivan','Lykov','1f886243-6e87-498a-95fa-272496ca8c83');
insert into module."lector" (id , age ,firstName, lastName, lesson_id) values ( 'e520bf9c-0a69-4d6e-8375-856c168ef7f0','57','Valeriy','Ogar','c2dd85d7-1ad4-4548-a78e-add249398101');
insert into module."lector" (id , age ,firstName, lastName, lesson_id) values ( 'dc15b961-6d38-475d-9742-fa65d6c45cd4','50','Andrey','Antypov','f6fb061d-4843-4f7f-8140-398ae7e6d099');
insert into module."lector" (id , age ,firstName, lastName, lesson_id) values ( '0b990666-4fb5-46b0-8058-4f0511a0fca9','40','Alexandr','Strelnitskiy','e0b0ef92-3ce0-48d1-badf-afe2e7bda44f');

insert into module."grade" (id , grade ,lesson_id, student_id) values ('ca17c6bb-ffbd-47be-898d-945a4bc7d2fd','5','1f886243-6e87-498a-95fa-272496ca8c83','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('c6727335-a32f-4686-aa1e-88c4ccedb574','2','c2dd85d7-1ad4-4548-a78e-add249398101','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('9f7fcd58-fdaa-40e0-9361-02380c388270','2','f6fb061d-4843-4f7f-8140-398ae7e6d099','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('3d85949c-6443-4ed7-afb1-040e56009e6d','4','e0b0ef92-3ce0-48d1-badf-afe2e7bda44f','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('b421d1e5-d758-4877-938a-f08447aac869','5','497cae95-365b-40a1-bd3a-bbadebe0ed33','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('a98e7439-3c34-46f4-a82f-55fb27fc00a9','3','dc73e9e8-79b4-4012-b6d2-b76a9891f629','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('74d7ced9-13f7-48cb-af4b-ffb768c39a4f','3','77b853ff-3674-4b78-b1f4-edc453aa2036','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('2f3a0da9-577f-4df3-bff9-4aaa507d6ea4','5','28c8920a-b873-4432-bd7b-90e950f99d51','365cfa71-e327-49f9-9ef3-c52227899527');
insert into module."grade" (id , grade ,lesson_id, student_id) values ('d986ce65-fe63-43ad-a671-be4b9ef23270','5','2c11e5c6-22f5-407e-ac06-5ecdbdc5518d','365cfa71-e327-49f9-9ef3-c52227899527');

alter table ONLY module."group"
    ADD  CONSTRAINT group_pkey PRIMARY KEY (id);


alter table ONLY module."grade"
    ADD CONSTRAINT grade_pkey PRIMARY KEY (id);

alter table ONLY module."lector"
    ADD CONSTRAINT lector_pkey PRIMARY KEY (id);

alter table ONLY module."lesson"
    ADD CONSTRAINT lesson_pkey PRIMARY KEY (id);

alter table ONLY module."student"
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);



alter table ONLY module."grade"
    ADD CONSTRAINT fk6hqfldlbqwjdh1pap4iot71y0 FOREIGN KEY (lesson_id)
    REFERENCES module.lesson (id),
    ADD CONSTRAINT fknrmfyw3u4l459wuii4g9nrb1b FOREIGN KEY (student_id)
        REFERENCES module.student (id);


alter table ONLY module."lector"
    ADD CONSTRAINT fk3dsq618nl6012vj38enhbkbwd FOREIGN KEY (lesson_id)
    REFERENCES module.lesson (id) MATCH SIMPLE;


alter table ONLY module."lesson"
    ADD CONSTRAINT fkaktcmamtkp0ubfotohjk6kp19 FOREIGN KEY (lector_id)
    REFERENCES module.lector (id) MATCH SIMPLE;


alter table ONLY module."student"
    ADD CONSTRAINT fk5kspkxpk3g2whr85g2f4di0gl FOREIGN KEY (group_id)
    REFERENCES module."group" (id) MATCH SIMPLE;