create table kehadiran (
    id serial,
    jam_masuk timestamp,
    jam_pulang timestamp
);

insert into kehadiran (jam_masuk, jam_pulang) 
values ('2013-01-15 08:00:00', '2013-01-15 16:00:00');

create table peserta(
int serial primary key, 
nama varchar(50)
);

insert into peserta(nama) values('Ustadho');
