package CommandPattern.src.co.com.implementacion;

public class DocumentEditCommand extends CommandApp {

	private Document _editableDoc;
    private String _text;

    public DocumentEditCommand(Document doc, String text) {
        _editableDoc = doc;
        _text = text;
        _editableDoc.Write(_text);
    }

	@Override
	public void Redo() {
		_editableDoc.Write(_text);
	}

	@Override
	public void Undo() {
		_editableDoc.Erase(_text);
	}

}
