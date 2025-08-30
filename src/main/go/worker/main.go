package main

import (
	_go "finale"
	"go.temporal.io/sdk/client"
	"go.temporal.io/sdk/worker"
	"log"
)

func main() {
	c, err := client.Dial(client.Options{})
	if err != nil {
		log.Fatalln("Unable to create client", err)
	}
	defer c.Close()

	w := worker.New(c, "generate-certificate-taskqueue", worker.Options{})

	w.RegisterWorkflow(_go.CertificateGeneratorWorkflow)

	err = w.Run(worker.InterruptCh())
	if err != nil {
		log.Fatalln("Unable to start worker", err)
	}
}
