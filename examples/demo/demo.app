// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

application Demo {
	view:Tabs()
}

tabview Tabs {
	tab {
		title: "Inventors"
		view: Inventors()
	}
	tab {
		title: "Reference"
		view: Reference()
	}
}

type String mapsTo "NSString"

entity Inventor {
	String name
	String imageUrl
	Invention[] inventions
}

entity Invention {
	String name
}

contentprovider AllInventors stores Inventor[] fetches JSON from "http://ralfebert.github.com/applitude/demo/inventors.json" selects ""
contentprovider AllErrorneousInventors returns Inventor[] fetches JSON from "http://localhost/none.json" selects ""

tableview Inventors {
	Inventor[] inventors = AllInventors()

	title: "Inventors"

	section {
		cell Default for inventor in inventors {
			text: inventor.name
			image: inventor.imageUrl
			action: InventorDetail(inventor)
		}
	}
}

tableview InventorDetail(Inventor inventor) {
	title: inventor.name
	style: Grouped

	section {
		cell Value2 {
			text: "Name"
			details: inventor.name
		}
	}

	section {
		title: "Inventions"
		cell Default for invention in inventor.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}
}

tableview InventionDetail(Invention invention) {
	title: invention.name
	style: Grouped
}

tableview Reference {
	title: "Reference"

	section {
		cell Default {
			text: "Cell styles"
			action: ReferenceCellStyles()
		}
		cell Default {
			text: "cell foreach"
			action: ReferenceCellForeach()
		}
		cell Default {
			text: "section + cell foreach"
			action: ReferenceSectionCellForeach()
		}
		cell Default {
			text: "Error handling"
			action: ReferenceErrorHandling()
		}
	}

}

tableview ReferenceCellStyles {
	title: "Cell styles"

	section {
		cell Default { text: "Style Default" }
		cell Subtitle { text: "Style" details: "Subtitle" }
		cell Value1 { text: "Style" details: "Value1" }
		cell Value2 { text: "Style" details: "Value2" }
	}

}

tableview ReferenceCellForeach {
	Inventor[] inventors = AllInventors()

	title: "cell foreach"

	section {
		cell Default for inventor in inventors {
			text: inventor.name
			accessory: Link
			action: InventorDetail(inventor)
		}
	}

}

tableview ReferenceSectionCellForeach {
	Inventor[] inventors = AllInventors()

	title: "section/cell foreach"

	section for inv in inventors {
		title: inv.name
		cell Default for invention in inv.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}

}


tableview ReferenceErrorHandling {
	Inventor[] inventors = AllErrorneousInventors()

	title: "Error handling"
	style: Grouped

	section {
		cell Default for inventor2 in inventors {
			text: inventor2.name
		}
	}

	section for inv in inventors {
		title: inv.name
		cell Default for invention in inv.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}

}