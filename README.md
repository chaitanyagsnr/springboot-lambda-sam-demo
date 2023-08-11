# springboot-lambda-sam-demo
Demo application showing how to deploy Springboot app to AWS Lambda using AWS SAM

### Build
sam build --template sam-template.yml

### Deploy
sam deploy --guided

### How to verify deployment
curl <API Gateway Invoke URL>/hello
