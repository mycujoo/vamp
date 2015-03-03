package io.magnetic.vamp_core.operation.notification

import io.magnetic.vamp_common.akka.RequestError
import io.magnetic.vamp_common.notification.Notification
import io.magnetic.vamp_core.model.artifact.Breed
import io.magnetic.vamp_core.model.deployment.Deployment


case class UnsupportedDeploymentRequest(request: Any) extends Notification with RequestError

case class NonUniqueBreedReferenceError(breed: Breed) extends Notification


