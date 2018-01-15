insert into firma (adresa,email, ime, telefon, web_site) values ('adresa1', 'firma1@gmail.com', 'firma1', 015555333, 'www.firma1.com');
insert into firma (adresa,email, ime, telefon, web_site) values ('adresa2', 'firma2@gmail.com', 'firma2', 015333555, 'www.firma2.com');

insert into komentar (dat_kreiranja, text) values ('21.12.2017', 'ovo je tekst komentara');
insert into komentar (dat_kreiranja, text) values ('22.12.2017', 'ovo je takodje komentar');

insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Ime1', 'admin', 'admin', 'ADMIN');


insert into kvar (dat_kreiranja, dat_popravke, dat_zakazivanja, ime, opis, popravljen)
values ('05.01.2018', '06.01.2018', '05.01.2018','kvar1', 'opis kvara1', 1);

insert into obavestenje (dat_kreiranja, ime, opis) values ('01.01.2018' , 'obavestenje 1' , 'opis');

insert into sednica (aktivna, dat_kreiranja, dat_zakazivanja) values (0, '05.01.2018','06.01.2018');

insert into stan (adresa, br_stanovnika, ime) values ('adresa 1', 5, 'stan1');

insert into zapisnik (dat_kreiranja, opis) values ('01.01.2018', 'opis 1');

insert into zgrada (adresa, br_naseljenih, br_stanova, ime) values ('Loznica', 5, 8, 'zgrada 1');

insert into stavka (dat_kreiranja, ime, opis) values ('2018.01.01', 'stavka1', 'opis stavke');

