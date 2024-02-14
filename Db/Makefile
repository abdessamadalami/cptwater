all:
	docker compose -f ./docker-compose.yml up --build
build:
	docker compose -f ./docker-compose.yml up --build
down:
	docker compose -f ./docker-compose.yml down
re:
	docker compose -f ./docker-compose.yml up --build
clean: down
	docker system prune -a
fclean:
	docker compose stop
	docker system prune --all --force --volumes
	docker network prune --force
	docker volume prune --force
	docker volume rm $(docker volume ls -q);
