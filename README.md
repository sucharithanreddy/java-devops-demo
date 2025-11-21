# 📘 Java DevOps Demo

A simple Java Spring Boot microservice used to practice end-to-end DevOps concepts including:

Maven Build

Docker & Docker Compose

Kubernetes Deployment

Minikube Cluster

GitHub Actions CI Pipeline

This project is intentionally small and beginner-friendly, but demonstrates a real DevOps workflow from code → container → cluster → CI.

# 🚀 Features

REST API with two endpoints:

GET /api/hello

GET /api/health

Packaged with Maven

Containerized using Docker

Local orchestration using Docker Compose

Kubernetes Deployment + NodePort Service

Deploys to Minikube

GitHub Actions for CI (build + test)

# 🧱 Project Structure
java-devops-demo/
 ├── src/                   # Java source code
 ├── pom.xml                # Maven build configuration
 ├── Dockerfile             # Multi-stage Docker build
 ├── docker-compose.yml     # Local dev environment
 ├── k8s/
 │    ├── deployment.yaml   # Kubernetes Deployment
 │    └── service.yaml      # Kubernetes Service
 ├── .github/workflows/
 │    └── ci.yml            # GitHub Actions CI
 └── README.md              # Documentation

# 🛠️ Run Locally (Docker Compose)

Build and start the service locally:

docker compose up --build


Test:

curl http://localhost:8081/api/hello
curl http://localhost:8081/api/health

# 🐳 Build Docker Image Manually
docker build -t devops-demo:1.0.0 .

# ☸️ Deploy to Minikube (Kubernetes)
Use Minikube's Docker daemon:
eval $(minikube docker-env)

Build inside Minikube:
docker build -t devops-demo:1.0.0 .

Apply Kubernetes manifests:
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml

Access the service:
minikube service devops-demo-service

# 🔄 Continuous Integration (GitHub Actions)

Every push to main triggers:

Code checkout

JDK 17 setup

Maven build

Test execution

Workflow file:
.github/workflows/ci.yml

# 📡 API Endpoints
Health Check
GET /api/health
Response: OK

Hello Endpoint
GET /api/hello
Response: Hello from DevOps demo!

# 📄 License

This project is for learning and practice purposes.
