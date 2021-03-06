package com.lambtors.poker_api.module.shared.domain.types

import cats.MonadError

object ThrowableTypeClasses {
  type MonadErrorThrowable[P[_]] = MonadError[P, Throwable]

  object MonadErrorThrowable {
    def apply[P[_]](implicit E: MonadError[P, Throwable]): MonadErrorThrowable[P] = E
  }

  type EitherThrowable[A] = Either[Throwable, A]
}
