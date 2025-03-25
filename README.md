# Axe

A sandbox environment for learning programming languages and fraweworks by
building URL minifiers

## Table of Contents

- [Description](#description)
- [Getting Started](#getting-started)
- [License](#license)

## Description

## Getting Started

```sh
git clone https://github.com/opeolluwa/axe
cd otter
npm install
```

### Language Integration

see the [documentation](https://opeolluwa.github.io/carbonyl) for the following
language integration

- [x] Bash
- [x] Go
- [x] JavaScript
- [x] Kotlin
- [x] Node.js
- [x] Rust

## Integration

Get started with cURl

```sh
curl  -X POST \
 'https://carbonyl.conrender.com/api/v2/minify' \
 --header 'Accept: */*' \
 --header 'Content-Type: application/json' \
 --data-raw '{
 "url":"<url-goes-here>"
}'
```

## License

This project is licensed and distributed inder the [MIT License](./LICENSE)
