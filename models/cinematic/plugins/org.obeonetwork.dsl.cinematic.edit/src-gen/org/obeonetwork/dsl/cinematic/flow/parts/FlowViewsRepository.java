/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.parts;

/**
 * 
 * @generated
 */
public class FlowViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Flow view descriptor
	 * @generated
	 */
	public static class Flow_ {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::Flow_::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::Flow_::properties::description";
			
			/**
			 * @generated
			 */
			
			public static String events = "flow::Flow_::properties::events";
			
			/**
			 * @generated
			 */
			
			public static String states = "flow::Flow_::properties::states";
			
			/**
			 * @generated
			 */
			
			public static String transitions = "flow::Flow_::properties::transitions";
			
	
		}
	
	}

	/**
	 * Transition view descriptor
	 * @generated
	 */
	public static class Transition {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::Transition::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String guard = "flow::Transition::properties::guard";
			
			/**
			 * @generated
			 */
			
			public static String modal = "flow::Transition::properties::modal";
			
			/**
			 * @generated
			 */
			
			public static String on = "flow::Transition::properties::on";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::Transition::properties::description";
			
			/**
			 * @generated
			 */
			
			public static String from = "flow::Transition::properties::from";
			
			/**
			 * @generated
			 */
			
			public static String to = "flow::Transition::properties::to";
			
	
		}
	
	}

	/**
	 * ActionState view descriptor
	 * @generated
	 */
	public static class ActionState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::ActionState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::ActionState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::ActionState::properties::description";
			
	
		}
	
	}

	/**
	 * ViewState view descriptor
	 * @generated
	 */
	public static class ViewState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::ViewState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::ViewState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String newInstance = "flow::ViewState::properties::newInstance";
			
			/**
			 * @generated
			 */
			
			public static String refresh = "flow::ViewState::properties::refresh";
			
			/**
			 * @generated
			 */
			
			public static String viewContainers = "flow::ViewState::properties::viewContainers";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::ViewState::properties::description";
			
	
		}
	
	}

	/**
	 * DecisionState view descriptor
	 * @generated
	 */
	public static class DecisionState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::DecisionState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::DecisionState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::DecisionState::properties::description";
			
	
		}
	
	}

	/**
	 * SubflowState view descriptor
	 * @generated
	 */
	public static class SubflowState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String subflow = "flow::SubflowState::properties::subflow";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::SubflowState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::SubflowState::properties::description";
			
	
		}
	
	}

	/**
	 * AsyncEventState view descriptor
	 * @generated
	 */
	public static class AsyncEventState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::AsyncEventState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::AsyncEventState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::AsyncEventState::properties::description";
			
	
		}
	
	}

	/**
	 * InitialState view descriptor
	 * @generated
	 */
	public static class InitialState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::InitialState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::InitialState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::InitialState::properties::description";
			
	
		}
	
	}

	/**
	 * AbortState view descriptor
	 * @generated
	 */
	public static class AbortState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::AbortState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::AbortState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::AbortState::properties::description";
			
	
		}
	
	}

	/**
	 * FinalState view descriptor
	 * @generated
	 */
	public static class FinalState {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::FinalState::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String actions = "flow::FinalState::properties::actions";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::FinalState::properties::description";
			
	
		}
	
	}

	/**
	 * FlowAction view descriptor
	 * @generated
	 */
	public static class FlowAction {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::FlowAction::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String calls = "flow::FlowAction::properties::calls";
			
			/**
			 * @generated
			 */
			
			public static String operations = "flow::FlowAction::properties::operations";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::FlowAction::properties::description";
			
	
		}
	
	}

	/**
	 * FlowEvent view descriptor
	 * @generated
	 */
	public static class FlowEvent {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "flow::FlowEvent::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String binds = "flow::FlowEvent::properties::binds";
			
			/**
			 * @generated
			 */
			
			public static String description = "flow::FlowEvent::properties::description";
			
	
		}
	
	}

}
