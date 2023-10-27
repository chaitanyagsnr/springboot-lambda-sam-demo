# springboot-lambda-sam-demo
Demo application showing how to deploy Springboot app to AWS Lambda using AWS SAM

### Prerequisites
Python, AWS CLI and AWS SAM CLI have to be installed. An active AWS account is needed.

### Build
`sam build --template cloudformation/sam-template.yml`

### Deploy
`sam deploy --config-env <ENV_NAME>`

Env Name can be `default`, `dev`, `qa` or `prod`

### How to verify deployment
`curl <API Gateway Invoke URL>/hello`
