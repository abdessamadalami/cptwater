FROM postgres
RUN apt-get update
RUN apt-get install -y postgis

COPY ./tools/init.sql /docker-entrypoint-initdb.d/


