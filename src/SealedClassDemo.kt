sealed class Result<Payload, Error>

class Success<Payload, Error>(val payload: Payload): Result<Payload, Error>()

class Failure<Payload, Error>(val error: Error): Result<Payload, Error>()