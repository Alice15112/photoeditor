build:
	mvn clean package

docker-build:
	docker build -t demo .

docker-run:
	docker run -p 8080:8080 demo

test:
	pytest tests.py

all: build docker-build docker-run test