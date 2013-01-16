create table kehadiran (
    id serial,
    jam_masuk timestamp,
    jam_pulang timestamp
);

insert into kehadiran (jam_masuk, jam_pulang) 
values ('2013-01-15 08:00:00', '2013-01-15 16:00:00');

create table jenis (
    kode integer,
    nama Varchar(20),
    denda_telat double precision,
    tarif_lembur double precision
    
      
);

insert into jenis (kode,nama,denda_telat,tarif_lembur) 
values ('2','benny',2000,50000);


drop table peserta;

create table peserta(
no_peserta varchar, 
nama varchar(50)
);

insert into peserta(no_peserta, nama) values('0001', 'Ustadho');
edit lagi