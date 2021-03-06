package com.lambtors.poker_api.module.poker.infrastructure.stub

import com.lambtors.poker_api.module.poker.application.player_cards.find.FindPlayerCardsQuery

object FindPlayerCardsQueryStub {
  def create(playerId: String = PlayerIdStub.random().playerId.toString): FindPlayerCardsQuery =
    FindPlayerCardsQuery(playerId)

  def random(): FindPlayerCardsQuery = create()

  def invalid(): FindPlayerCardsQuery = create(PlayerIdStub.invalid())
}
