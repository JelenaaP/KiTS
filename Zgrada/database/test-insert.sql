set foreign_key_checks = 0;

-- delete all rows
truncate table korisnik_servisa;
truncate table firma;
truncate table zgrada;
truncate table kvar;
truncate table komentar;
truncate table obavestenje;
truncate table sednica;
truncate table stan;
truncate table zapisnik;
truncate table stavka;
truncate table popravlja;
truncate table radi;


alter table 'korsinik_servisa' auto_increment = 1;
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Janko', 'janko', 'admin', 'ADMIN');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Marko', 'marko', 'admin', 'USER');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Marija', 'marija', 'admin', 'USER');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Mirjana', 'mirjana', 'admin', 'USER');

alter table 'firma' auto_increment = 1;
insert into firma (adresa,email, ime, telefon, web_site, vlasnik_id) values ('adresa1', 'firma1@gmail.com', 'firma1', 55333, 'www.firma1.com',1);
insert into firma (adresa,email, ime, telefon, web_site, vlasnik_id) values ('adresa2', 'firma2@gmail.com', 'firma2', 15333555, 'www.firma2.com',2);

alter table 'zgrada' auto_increment = 1;
insert into zgrada (adresa, br_naseljenih, br_stanova, ime, vlasnik_id) values ('Loznica', 5, 8, 'zgrada 1', 2);
insert into zgrada (adresa, br_naseljenih, br_stanova, ime, vlasnik_id) values ('Loznica 2', 5, 8, 'zgrada 2', 1);

alter table 'kvar' auto_increment = 1;
insert into kvar (dat_kreiranja, dat_popravke, dat_zakazivanja, ime, opis, popravljen, kreator_id,zgrada_id)
values ('2018-05-01', '2018-05-06', '2018-05-05','kvar1', 'opis kvara1', 1,1,1);

alter table 'komentar' auto_increment = 1;
insert into komentar (dat_kreiranja, text, kreator_id, kvar_id) values ('2015-01-01', 'ovo je tekst komentara',1,1);
insert into komentar (dat_kreiranja, text, kreator_id, kvar_id) values ('2015-12-01', 'ovo je takodje komentar',2,1);

alter table 'obavestenje' auto_increment = 1;
insert into obavestenje (dat_kreiranja, ime, opis, kreator_id, zgrada_id) values ('2018-01-01' , 'obavestenje1' , 'opis obavestenja1',1,1);
insert into obavestenje (dat_kreiranja, ime, opis, kreator_id, zgrada_id) values ('2018-02-01' , 'obavestenje1' , 'opis obavestenja1',1,1);

alter table 'sednica' auto_increment = 1;
insert into sednica (aktivna, dat_kreiranja, dat_zakazivanja, kreator_id, zapisnik_id, zgrada_id) values (0, '2018-01-05','2018-01-05', 1,1, 1);

alter table 'stan' auto_increment = 1;
insert into stan (adresa, br_stanovnika, ime, vlasnik_id, zgrada_id) values ('adresa 1', 5, 'stan1', 3, 1);
insert into stan (adresa, br_stanovnika, ime, vlasnik_id, zgrada_id) values ('adresa 1', 5, 'stan1', 1, 1);

alter table 'zapisnik' auto_increment = 1;
insert into zapisnik (dat_kreiranja, opis, kreator_id, zgrada_id) values ('2018-01-01', 'opis 1', 2, 1);

alter table 'stavka' auto_increment = 1;
insert into stavka (dat_kreiranja, ime, opis, kreator_id, sednica_id) values ('2018-01-01', 'stavka1', 'opis stavke', 1, 3);

alter table 'popravlja' auto_increment = 1;
insert into popravlja (kvar_id, korisnik_servisa_id, firma_id) values (1, 3, 1);

alter table 'radi' auto_increment = 1;
insert into radi (firma_id, korisnik_servisa_id) values (1, 3);

set foreign_key_checks = 1;
