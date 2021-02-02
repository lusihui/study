# study
组件及架构介绍
	components
		Prometheus server
		client libraries
		Pushgateway
		exporters
		Alertmanager

部署及配置文件介绍

基本概念
	Data model
		metrics name and labels
	metric types
		counter
		gauge
		histogram
		summary
	jobs and instances

promQL介绍
	expression language data types
		instant vector
			label matching operators
		range vector
			time durations
			offset
		scalar
		string(unused)
	operators
		binary operators
			arithmetic binary operators
			comparison binary operators
			logical binary operators
		vector matching
		aggregation operators
	function

监控springboot
	micrometer
	自定义监控metrics
		PrometheusMeterRegistry

grafana部署及接入prometheus

pushgateway
	client library

exporters
	mongodb_exporter

alertmanager
