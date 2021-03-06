package org.icescrum.core.event

import org.icescrum.core.domain.User
import org.icescrum.core.domain.Sprint

/**
 * Created by IntelliJ IDEA.
 * User: vbarrier
 * Date: 21/02/11
 * Time: 00:59
 * To change this template use File | Settings | File Templates.
 */

class IceScrumSprintEvent extends IceScrumEvent {

  static final String EVENT_ACTIVATED = 'Activated'
  static final String EVENT_CLOSED = 'Closed'
  static final String EVENT_UPDATED_DONE_DEFINITION = 'UpdatedDoneDefinition'
  static final String EVENT_UPDATED_RETROSPECTIVE = 'UpdatedRetrospective'

  IceScrumSprintEvent(Sprint sprint, Class generatedBy, User doneBy, def type){
    super(sprint, generatedBy, doneBy, type)
  }
}